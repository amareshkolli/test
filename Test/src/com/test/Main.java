package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream is = Main.class.getResourceAsStream("input.txt");

		Map<String, Integer> apiToVersion = new HashMap<String, Integer>();
		Set<String> outdatedApps = new HashSet<String>();

		List<String> inputLines = new ArrayList<String>();
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			String line;
			while ((line = br.readLine()) != null) {
				inputLines.add(line);
				String apiName = line.split(",")[1];
				String version = line.split(",")[2].trim();
				int versionNumber = Integer.parseInt(version.substring(1, version.length()));
				if (apiToVersion.get(apiName) == null || apiToVersion.get(apiName) < versionNumber) {
					apiToVersion.put(apiName, versionNumber);
				}
			}
		}

		for (String line : inputLines) {
			String appName = line.split(",")[0];
			String apiName = line.split(",")[1];
			String version = line.split(",")[2].trim();
			int versionNumber = Integer.parseInt(version.substring(1, version.length()));

			if (apiToVersion.get(apiName) > versionNumber) {
				outdatedApps.add(appName);
			}

		}
		for (String outdatedApp : outdatedApps) {
			writer.write(outdatedApp + "\n");
		}
		writer.close();
	}

}
