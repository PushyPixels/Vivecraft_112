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
public class HmdRect2_t extends Structure {
	public HmdVector2_t vTopLeft;
	public HmdVector2_t vBottomRight;
	public HmdRect2_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("vTopLeft", "vBottomRight");
	}
	public HmdRect2_t(HmdVector2_t vTopLeft, HmdVector2_t vBottomRight) {
		super();
		this.vTopLeft = vTopLeft;
		this.vBottomRight = vBottomRight;
	}
	public HmdRect2_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends HmdRect2_t implements Structure.ByReference {
		
	};
	public static class ByValue extends HmdRect2_t implements Structure.ByValue {
		
	};
}
