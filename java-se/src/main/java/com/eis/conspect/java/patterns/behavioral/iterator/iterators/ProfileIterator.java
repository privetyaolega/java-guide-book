package com.eis.conspect.java.patterns.behavioral.iterator.iterators;

import com.eis.conspect.java.patterns.behavioral.iterator.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
