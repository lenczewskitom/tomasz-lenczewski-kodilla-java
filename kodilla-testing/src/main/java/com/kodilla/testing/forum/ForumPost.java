package com.kodilla.testing.forum;

public class ForumPost {
    private String author;
    private  String postBody;

    public ForumPost(String author, String postBody) {
        this.author = author;
        this.postBody = postBody;
    }

    public String getAuthor() {
        return author;
    }

    public String getPostBody() {
        return postBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!author.equals(forumPost.author)) return false;
        return postBody.equals(forumPost.postBody);
    }

    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = 31 * result + postBody.hashCode();
        return result;
    }
}
