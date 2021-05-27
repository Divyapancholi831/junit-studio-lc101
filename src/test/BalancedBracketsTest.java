package test;
import main.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //test 1
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //test 2
    @Test
    public void twoNestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    //test 3
    @Test
    public void threeNestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    //test 4

    @Test
    public void bracketWithStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[divya]"));
    }

    //test 5
    @Test
    public  void  bracketWithEmptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("['']"));
    }

    //test 6
    @Test
    public void fourNestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    //test 7
    @Test
    public void emptyInputReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //test 8
    @Test
    public void BracketsFollwedByStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Divya"));
    }
    //test 9
    @Test
    public void onlyOneOpeningBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //test 10
    @Test
    public void onlyOpeningBracketWithStringReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[divya"));
    }

    //test 11
    @Test
    public void onlyClosingBracketWithStringReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("divya]"));
    }

    //test 12
    @Test
    public void onlyOneClosingBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }


}
