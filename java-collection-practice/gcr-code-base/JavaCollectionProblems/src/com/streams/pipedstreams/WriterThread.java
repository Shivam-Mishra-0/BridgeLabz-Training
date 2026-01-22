package com.streams.pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {
	private PipedOutputStream outputStream;
	
	// constructor
	public WriterThread(PipedOutputStream outputStream) {
		this.outputStream = outputStream;
	}

	// Thread class method
	@Override
	public void run() {
		try {
			String message = "Hello from Writer Thread";

			outputStream.write(message.getBytes());
			outputStream.close();

		} catch (IOException e) {
			System.out.println("Writer Error: " + e.getMessage());
		}
	}
}
