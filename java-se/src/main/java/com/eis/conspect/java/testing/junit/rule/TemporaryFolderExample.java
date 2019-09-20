package com.eis.conspect.java.testing.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderExample {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testTempFolder() {
        System.out.println(temporaryFolder.getRoot());
    }
}
