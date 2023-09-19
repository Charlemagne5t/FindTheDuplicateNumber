import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findDuplicateTest1() {
        int[] nums = {1, 3, 4, 2, 2};
        int expected = 2;
        int actual = new Solution().findDuplicate(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDuplicateTest2() {
        int[] nums = {3, 1, 3, 4, 2};
        int expected = 3;
        int actual = new Solution().findDuplicate(nums);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findDuplicateTest3() {
        int[] nums = {1, 1};
        int expected = 1;
        int actual = new Solution().findDuplicate(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDuplicateTest4() {
        int[] nums = {2,5,9,6,9,3,8,9,7,1};
        int expected = 9;
        int actual = new Solution().findDuplicate(nums);
        Assert.assertEquals(expected, actual);
    }

}
