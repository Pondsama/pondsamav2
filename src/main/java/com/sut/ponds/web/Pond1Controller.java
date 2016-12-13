package com.sut.ponds.web;
import com.sut.ponds.domain.Pond1;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pond1s")
@Controller
@RooWebScaffold(path = "pond1s", formBackingObject = Pond1.class)
public class Pond1Controller {
}
