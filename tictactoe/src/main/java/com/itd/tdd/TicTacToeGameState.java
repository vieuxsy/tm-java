package com.itd.tdd;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.net.UnknownHostException;

public class TicTacToeGameState {

    public static final String DB_NAME = "tic-tac-toe-db";
    public static final String COLLECTION_NAME = "tic-tac-toe-collection";
    private MongoCollection mongoCollection;

    public TicTacToeGameState() throws UnknownHostException {
        DB db = new MongoClient().getDB(DB_NAME);
        mongoCollection = new Jongo(db).getCollection(COLLECTION_NAME);
    }

    public boolean save(TicTacToeGameRound round) {
        try {
            getMongoCollection().save(round);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean clear() {
        try {
            getMongoCollection().drop();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

//    public TicTacToeGameRound findById(int id) {
//        return getMongoCollection().findOne("{_id: #}", id).as(TicTacToeGameRound.class);
//    }

    public MongoCollection getMongoCollection() {
        return mongoCollection;
    }
}
