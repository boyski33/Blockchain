package com.company;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class BlockHeaderTest {
    private BlockHeader header;
    @Before
    public void setup() {
        header = new BlockHeader("hash0", "nonce", "rootHash");
    }

    @Test
    public void assertValidToStringConversion() {
        // GIVEN
        // todo
        final Date date = Mockito.mock(Date.class);
        Mockito.when(date.getTime()).thenReturn(123L);
        String expected = "";

        // WHEN
        String actual = header.toString();
        System.out.println(header);

        // THEN
        assertEquals(expected, actual);
    }
}
