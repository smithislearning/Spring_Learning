package HelloWorldP;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
	private static MessageSupportFactory instance;

	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;

	paivate MessageSupportFactory() {
		prop = new Properties();

		try {
			props.load(new FileInputStream

