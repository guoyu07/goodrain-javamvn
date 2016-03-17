package com.goodrain.lucien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

/**
 * Created by lucien on 16/1/21.
 */
@Controller
@RequestMapping("page")
public class PageController {

    /**
     * 跳转到对应的jsp页面
     *
     * @param path
     * @return
     */
    @RequestMapping("/{path}")
    public String turnToPage(@PathVariable("path") String path,
                             @Context HttpServletRequest request) {
        request.getSession().getId();
        return path;
    }

}
