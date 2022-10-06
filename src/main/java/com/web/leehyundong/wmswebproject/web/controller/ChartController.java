package com.web.leehyundong.wmswebproject.web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ChartController {

    @GetMapping("/echarts")
    public String echartView() {
        return "charts-echarts";
    }

    @GetMapping("/chartjs")
    public String chartJsView(){
        return "charts-chartjs";
    }

    @GetMapping("/apexchart")
    public String apexChartView(){
        return "charts-apexcharts";
    }
}
