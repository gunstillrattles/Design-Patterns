package kz.narxoz.patterns.iterator.social_networks;

import kz.narxoz.patterns.iterator.iterators.ProfileIterator;
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
