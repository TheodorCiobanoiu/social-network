package com.example.socialnetwork.factory;

import com.example.socialnetwork.model.*;

public class ReactFactory {

    public static React createReaction(String reaction){
        switch (reaction){
            case "Laugh": return new LaughReaction();
            case "Like": return new LikeReaction();
            case "Love": return new LoveReaction();
            case "Sad": return new SadReaction();
            default: return null;
        }
    }
}
