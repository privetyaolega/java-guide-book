package com.eis.conspect.java.patterns.behavioral.iterator.socials;

import com.eis.conspect.java.patterns.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
