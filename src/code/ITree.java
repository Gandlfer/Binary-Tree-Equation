package code;

public interface ITree {
	void setRoot(INode root);
    INode getRoot();
    void prefix_visit();	// print an expression in a prefix order
    void infix_visit();	    // print an expression in an infix order
    void postfix_visit();	    // print an expression in a postfix order
    double evaluate(INode node);                   // evaluate an expression and return a value

}
