package com.ll.exam.article.controller;

import com.ll.exam.annotation.Controller;
import com.ll.exam.annotation.GetMapping;

@Controller // ArticleController가 컨르롤러라는 것을 알려줌.
public class ArticleController {
    @GetMapping("/usr/article/list") // /usr/article/list/free와 같이 관련된 요청을 처리하는 함수라고 알려주는 것.
    // 아래 showList는 Get /usr/article/list 으로 요청이 왔을 때 실행 되어야 하는 함수이다.
    public void showList () {

    }
}
