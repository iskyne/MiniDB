package api;

import java.util.List;

public class Transaction {
	
	//get a new transaction
	public static Transaction open(){
		return null; 
	}
	
	// act as the "select" in a sql
	public Relation select(Relation rl,List<Column> columns){
		return null;
	}
	
	//act as the "insert" in a sql
	public boolean insert(Table tb,Row r){
		return false;
	}
	
	public Relation update(Table tb,Column c,Column newC,Condition cond){
		return null;
	}
	
	public Relation delete(Table tb,Condition c){
		return null;
	}
	
	
	//act as the "where" in a sql
	public Relation where(Relation r,Condition c){
		return null;
	}
	
	
	//act as the "from" in a sql
	public Relation join(Relation r1,Relation r2){
		return null;
	}
	
	//act as the "inner join" in a sql
	public Relation innerJoin(Relation r1,Relation r2,Condition c){
		return null;
	}
	
	
	//commit a transaction
	public void commit(){
		
	}
	
	
	//rollback a transaction
	public void roolback(){
		
	}
}
