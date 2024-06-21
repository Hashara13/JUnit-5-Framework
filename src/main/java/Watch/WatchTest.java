package Watch;

import java.util.Optional;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class WatchTest implements TestWatcher{

	@Override
	public void testAborted(ExtensionContext context, Throwable cause) {
		// TODO Auto-generated method stub
		TestWatcher.super.testAborted(context, cause);
	}

	@Override
	public void testDisabled(ExtensionContext context, Optional<String> reason) {
		// TODO Auto-generated method stub
		
//		TestWatcher.super.testDisabled(context, reason);
		System.out.println("Disabled"+context.getTestMethod()+"With"+reason);

	}

	@Override
	public void testFailed(ExtensionContext context, Throwable cause) {
		// TODO Auto-generated method stub
		TestWatcher.super.testFailed(context, cause);
	}

	@Override
	public void testSuccessful(ExtensionContext context) {
		// TODO Auto-generated method stub
		TestWatcher.super.testSuccessful(context);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
