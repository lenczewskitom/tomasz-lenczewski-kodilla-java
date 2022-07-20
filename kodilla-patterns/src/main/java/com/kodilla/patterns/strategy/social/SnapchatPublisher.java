package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Use Snapchat to publish post";
    }
}
