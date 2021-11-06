package crackingthecode.datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArraysAndStringsTest {
    private ArraysAndStrings classUnderTest;

    @BeforeEach
    void setUp() {
        classUnderTest = new ArraysAndStrings();
    }

    /**************** Q1.2 *******************/

    @Test
    @DisplayName("isPermutation(null, null) should return true")
    public void isPermutation_ofNulls_shouldSuccess() {
        Assertions.assertTrue(this.classUnderTest.isPermutationOf(null, null));
    }

    @Test
    @DisplayName("isPermutation('abc', null) should return false")
    public void isPermutation_ofStringAndNull_shouldFail() {
        Assertions.assertFalse(this.classUnderTest.isPermutationOf("abc", null));
        Assertions.assertFalse(this.classUnderTest.isPermutationOf(null, "abc"));
    }

    @Test
    @DisplayName("isPermutation('abc', 'cba') should return true")
    public void isPermutation_ofStrings_shouldSucceed() {
        Assertions.assertTrue(this.classUnderTest.isPermutationOf("abc", "cba"));
        Assertions.assertTrue(this.classUnderTest.isPermutationOf("cba", "abc"));
    }

    /**************** Q1.5 *******************/

    @Test
    public void compressString(){
        Assertions.assertEquals("a3", this.classUnderTest.compressString("aaa"));
        Assertions.assertEquals("", this.classUnderTest.compressString(""));
        Assertions.assertEquals(null, this.classUnderTest.compressString(null));
        Assertions.assertEquals("a3b2", this.classUnderTest.compressString("aaabb"));
        Assertions.assertEquals("a2c2b1a1", this.classUnderTest.compressString("aaccba"));
        Assertions.assertEquals("a1", this.classUnderTest.compressString("a"));
    }

    @Test
    void isRotation() {
        Assertions.assertTrue(classUnderTest.isRotationOf("perl", "perl"));
        Assertions.assertTrue(classUnderTest.isRotationOf("perl", "lper"));
        Assertions.assertTrue(classUnderTest.isRotationOf(null, null));
        Assertions.assertTrue(classUnderTest.isRotationOf("", ""));

        Assertions.assertFalse(classUnderTest.isRotationOf("java", "jav"));
    }


}
