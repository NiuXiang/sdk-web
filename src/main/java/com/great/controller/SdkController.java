package com.great.controller;

import com.great.GtControllerSdk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SdkController {

    @Autowired
    private GtControllerSdk gtControllerSdk;

    @RequestMapping("getControllerSdkParam")
    public String getControllerSdkParam() {
        return gtControllerSdk.getControllerSdkParam();
    }

    @RequestMapping("getControllerId")
    public String getControllerId(String controllerIp) {
        return gtControllerSdk.getControllerId(controllerIp);
    }

    @RequestMapping("getControllersNum")
    public String getControllersNum(int controllerState) {
        return gtControllerSdk.getControllersNum(controllerState);
    }

    @RequestMapping("getControllers")
    public String getControllers(int controllerState, long start, long max) {
        return gtControllerSdk.getControllers(controllerState, start, max);
    }

    @RequestMapping("ctrlController")
    public String ctrlController(String controllerId, String cmd) {
        return gtControllerSdk.ctrlController(controllerId, cmd);
    }

    @RequestMapping("setControllerParam")
    public int setControllerParam(String controllerId, String param) {
        return gtControllerSdk.setControllerParam(controllerId, param);
    }

    @RequestMapping("getControllerParam")
    public String getControllerParam(String controllerId, String paramName) {
        return gtControllerSdk.getControllerParam(controllerId, paramName);
    }
}
