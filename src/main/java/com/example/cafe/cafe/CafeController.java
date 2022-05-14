package com.example.cafe.cafe;

import com.example.cafe.comment.Comment;
import com.example.cafe.comment.CommentService;
import freemarker.template.utility.StringUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller
@RequestMapping("/cafes")
@RequiredArgsConstructor
public class CafeController {
    private final CafeService cafeService;
    private final CommentService commentService;


    @GetMapping("/mainPage")
    public String giveCafeListPage(Model model, Authentication authentication){

        if (authentication==null){
            model.addAttribute("hi", "NeedRegistration");
        }else{
            String name = authentication.getName();
            model.addAttribute("userName", name);
        }

        List<Cafe> cafes = cafeService.getAllCafes();
        model.addAttribute("cafes", cafes);
        return "list-cafe";
    }

    @GetMapping("/searchCafes")
    public String giveSearchedCafes(Model model, @RequestParam(value = "name") String name){
        List<Cafe> cafes =cafeService.getCafesByName(name);
        model.addAttribute("cafes", cafes);
        return "searched-cafes";
    }

    @GetMapping("/searchByDescriptionCafes")
    public String giveSearchedByDescriptionCafes(Model model, @RequestParam(value = "desc") String desc){
        List<Cafe> cafes = cafeService.getCafesByDescription (desc);
        model.addAttribute("cafes", cafes);
        return "searched-cafes";
    }

    @GetMapping("/addNewPlace")
    public String giveAddCafePage(Model model){
        return "add-cafe";
    }


    @GetMapping("/saveCafe")
    public String addNewCafe(@RequestParam(value = "name") String name,
                             @RequestParam(value = "description") String description,
                             @RequestParam(value = "link") String link){

        cafeService.saveNewCafe(name, description, link);

        return "redirect:/cafes/mainPage";
    }

    @GetMapping("/cafe/{id}")
    public String giveSingleCafePage(Model model, @PathVariable Long id, Authentication authentication){
        if (authentication==null){
            model.addAttribute("userName", "null");
        }else{
            String name = authentication.getName();
            model.addAttribute("userName", name);
        }

        List<Comment> comments = commentService.getCommentsByCafeId(id);

        Cafe cafe = cafeService.getCafeById(id);
        model.addAttribute("cafe", cafe);
        model.addAttribute("comments", comments);

        return "single-cafe";
    }

}
