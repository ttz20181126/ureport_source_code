package com.bstek.ureport.console.cache;

import com.bstek.ureport.cache.CacheUtils;
import com.bstek.ureport.console.RenderPageServletAction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClearCacheServletAction extends RenderPageServletAction {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CacheUtils.clearCache();
    }

    @Override
    public String url() {
        return "/clearCache";
    }
}
