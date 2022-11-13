package kz.narxoz.patterns.iterator.iterators;

import kz.narxoz.patterns.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
