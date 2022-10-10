package com.web.leehyundong.wmswebproject.web.controller;


import com.web.leehyundong.wmswebproject.service.UserArgumentService;
import com.web.leehyundong.wmswebproject.service.UserDependencyService;
import com.web.leehyundong.wmswebproject.service.UserObjectService;
import com.web.leehyundong.wmswebproject.service.UserSourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class TableController {
    private final UserArgumentService userArgumentService;

    private final UserObjectService userObjectService;

    private final UserSourceService userSourceService;

    private final UserDependencyService userDependencyService;

    @GetMapping("/tables")
    public String tableChart(Model model){
        model.addAttribute("user_arguments", userArgumentService.findAllUserArgument());
        model.addAttribute("user_dependency", userDependencyService.findAllUserDependency());
        model.addAttribute("user_object", userObjectService.findAllUserObject());
        model.addAttribute("user_object_updated", userObjectService.findAllUserUpdatedObject());
        model.addAttribute("user_source", userSourceService.findAllUserSource());

        return "tables-general";
    }

    @GetMapping("/argument")
    public String userArgument(Model model){
        model.addAttribute("user_arguments", userArgumentService.findAllUserArgument());
        return "user-argument";
    }

    @GetMapping("/argument/search")
    public String searchUserArgument(@RequestParam String keyword, Model model){
        System.out.println("keyword :" + keyword);

        model.addAttribute("user_arguments", userArgumentService.findByKeyword(keyword));

        return "user-argument";
    }

    @GetMapping("/dependency")
    public String userDependency(Model model){
        model.addAttribute("user_dependency", userDependencyService.findAllUserDependency());
        return "user-dependency";
    }

    @GetMapping("/dependency/search")
    public String searchUserDependency(@RequestParam String keyword, Model model){
        model.addAttribute("user_dependency", userDependencyService.findByKeyword(keyword));
        return "user-dependency";
    }

    @GetMapping("/object")
    public String userObject(Model model){
        model.addAttribute("user_object", userObjectService.findAllUserObject());

        return "user-object";
    }

    @GetMapping("/updated_object")
    public String userUpdatedObject(Model model){
        model.addAttribute("user_object_updated", userObjectService.findAllUserUpdatedObject());

        return "user-updated-object";
    }

    @GetMapping("/source")
    public String userSource(Model model){
//        model.addAttribute("user_source", userSourceService.findAllUserSource());
        model.addAttribute("codeText", userSourceService.getSpecificSource().getText());
        model.addAttribute("editedCodeText", userSourceService.getSpecificSource().getText().replaceAll("[A-B]+", ""));
        model.addAttribute("name", userSourceService.getSpecificSource().getName());

        return "user-source";

    }
}

