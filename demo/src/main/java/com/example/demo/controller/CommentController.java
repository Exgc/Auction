package com.example.demo.controller;

import com.example.demo.service.Impl.commentServiceImpl;
import com.example.demo.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
/**
 * @program: SchoolAuction
 * @description: Deal with comments
 * @author: Yao Yunzhi, Xu Yingliang, Li Ao
 * @create: 2020-06-15 09:52
 **/
public class CommentController {
    @Autowired
    commentServiceImpl commentService;

    /**
    * @Description:
    * @Param: commentId 被删除留言的id
    * @return: com.example.demo.util.Msg
    * @Author: Yao Yunzhi, Xu Yingliang.
    * @Date: 2020/6/15
    */
    @RequestMapping("/deleteComment")
    public Msg deleteComments(int commentId){
        return commentService.deleteComment(commentId);
    }


    /**
    * @Description:
    * @Param: [reviewId] 被删除的评论id
    * @return: com.example.demo.util.Msg
    * @Author: Yao Yunzhi, Xu Yingliang.
    * @Date: 2020/6/15
    */
    @RequestMapping("/deleteReviewsForComments")
    public Msg deleteReviews(int reviewId){
        return commentService.deleteReview(reviewId);
    }
    
    /** 
    * @Description: 获取对应的商品的留言 
    * @Param: [itemId] 
    * @return: com.example.demo.util.Msg 
    * @Author: Mr.Wang 
    * @Date: 2020/6/15 
    */
    @RequestMapping("/getcomments")
    public Msg getComments(int itemId){
        return commentService.getComments(itemId);
    }


}