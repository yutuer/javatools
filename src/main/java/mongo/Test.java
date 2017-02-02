package mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * 推荐用spring方式访问
 * @author yutuer
 *
 */
public class Test {

	public static void main(String[] args) throws UnknownHostException {
		MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
		DB db = mongoClient.getDB("test");
		DBCollection dbCollection = db.getCollection("blog");
		DBObject dbObject = dbCollection.findOne();
		System.out.println(dbObject.get("b"));

//		BasicDBObject doc = new BasicDBObject("name", "MongoDB").append("type", "database").append("count", 1)
//				.append("info", new BasicDBObject("x", 203).append("y", 102));
//		dbCollection.insert(doc);
		
		System.out.println(dbCollection.getCount());
	}
}
