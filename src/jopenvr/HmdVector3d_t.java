package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class HmdVector3d_t extends Structure {
	/** double[3] */
	public double[] v = new double[3];
	public HmdVector3d_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("v");
	}
	public HmdVector3d_t(double v[]) {
		super();
		if ((v.length != this.v.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.v = v;
	}
	public HmdVector3d_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends HmdVector3d_t implements Structure.ByReference {
		
	};
	public static class ByValue extends HmdVector3d_t implements Structure.ByValue {
		
	};
}
