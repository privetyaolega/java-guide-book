//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package utils.logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import toolkit.config.PropertyProvider;

import java.io.File;
import java.io.IOException;

public class CustomLogger {

    private static final ThreadLocal<String> LOG_FILE_PATH = new ThreadLocal();
    private static final String LOG_DIR_NAME = "LOG";

    public CustomLogger() {
    }

    private static void setTestMethodLogFileProperties(String testMethodLogFilePath) {
        LOG_FILE_PATH.set(testMethodLogFilePath);
    }

    public static String getCurrentLogFilePath() {
        return (String) LOG_FILE_PATH.get();
    }

    public static Logger getInstance() {
        String className = "";

        try {
            className = Class.forName((new Throwable()).getStackTrace()[2].getClassName()).toString();
        } catch (Exception var2) {

        }

        return LoggerFactory.getLogger(className);
    }

    public static String getLogDirectory() {
        return (new File("")).getAbsolutePath() + File.separator + FilenameUtils.separatorsToSystem(PropertyProvider.getProperty("test.output")) + File.separator + "LOG";
    }

    public static void setTestMethodName(String testMethodFullName) {
        String testMethodLogFilePath;
        if (testMethodFullName != null) {
            testMethodLogFilePath = getLogDirectory() + File.separator + testMethodFullName.replace(".", File.separator) + ".log";
            File testMethodLogFile = new File(testMethodLogFilePath);
            if (!testMethodLogFile.getParentFile().getAbsoluteFile().exists()) {
                testMethodLogFile.getParentFile().mkdirs();
            }
        } else {
            testMethodLogFilePath = null;
        }

        setTestMethodLogFileProperties(testMethodLogFilePath);
    }

    public static void cleanLogDirectory() {
        try {
            FileUtils.deleteDirectory(new File(getLogDirectory()));
        } catch (IOException var1) {
            ;
        }

    }

    public static String getLogFile() {
        String filePath = (String)LOG_FILE_PATH.get();
        if (filePath == null) {
            String fileName = FilenameUtils.separatorsToSystem(PropertyProvider.getProperty("test.logfilename", "log.log"));
            filePath = getLogDirectory() + File.separator + fileName;
        }

        if (!(new File(filePath)).getParentFile().exists()) {
            (new File(filePath)).getParentFile().mkdirs();
        }

        return filePath;
    }

    static {
        cleanLogDirectory();
    }
}
