package c10_IgnoreTest;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestJunit1.class,
	TestJunit2.class
})

@Ignore
public class JunitTestSuite {

}
