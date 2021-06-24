package com.softeq.jm.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by ydziadkouskaya on 6/24/2021.
 */

@Controller
public class HomeController implements Serializable {
    @Inject
    //класс, который отвечает добавление атрибутов в реквест и за redirect (пока похоже на сессию, хотя странно)
    private Result result;

    @Get
    public void home(){

    }

    @Get
    @Path("")
    public void index() {
        result.redirectTo(this).home();

    }
}
