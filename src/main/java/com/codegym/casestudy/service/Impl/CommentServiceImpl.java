package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.models.Comment;
import com.codegym.casestudy.models.User;
import com.codegym.casestudy.repositories.IBlogRepository;
import com.codegym.casestudy.repositories.ICommentRepository;
import com.codegym.casestudy.repositories.IUserRepository;
import com.codegym.casestudy.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {
    @Autowired
    private ICommentRepository commentRepository;

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Comment> findAll() {
        return (List<Comment>) commentRepository.findAll();
    }

    @Override
    public List<Comment> findAllByBlog() {
        return (List<Comment>) commentRepository.findAll();
    }


    @Override
    public Comment findOne(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment delete(Long id) {
        Comment comment = commentRepository.findById(id).orElse(null);
        commentRepository.delete(comment);
        return comment;
    }

    @Override
    public Comment save(Comment comment) {
        commentRepository.save(comment);
        return comment;
    }

    @Override
    public List<Comment> findAllByBlogId(Long blogId) {
        return commentRepository.findAllByBlog_Id(blogId);
    }
}
