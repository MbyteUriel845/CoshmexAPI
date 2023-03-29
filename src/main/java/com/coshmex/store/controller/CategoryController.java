package com.coshmex.store.controller;

import com.coshmex.store.service.CategoryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
public class CategoryController {
    static private Logger logger = LogManager.getLogger(CategoryController.class);
    @Autowired
    CategoryService categoryService;
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping(value = {"/rest/getCategories"}, method = {RequestMethod.GET})
    @GetMapping("/rest/getCategories")
    @ResponseBody

    public List<String> getCategoria(HttpServletRequest request,
                                     @RequestParam(value = "categoria", defaultValue = "", required = false) String categoria) {

        logger.info("   CATEGORIAS EXISTENTES  ");

        return categoryService.getCategories(categoria);

        }

}
