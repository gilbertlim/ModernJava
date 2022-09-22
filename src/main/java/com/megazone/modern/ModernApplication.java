package com.megazone.modern;

import com.megazone.modern.BehaviorParameterization.BehaviorParameterization;
import com.megazone.modern.Etc.FindFile;
import com.megazone.modern.Etc.MeaningOfThis;
import com.megazone.modern.Generic.GenericUse;
import com.megazone.modern.Lambda.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;


@SpringBootApplication
public class ModernApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModernApplication.class, args);

		// behavior parameterization
		BehaviorParameterization.filterApples();


		// lambda
		Main.main();


		// hidden file
		FindFile.hiddenFiles();


		// 문제
		MeaningOfThis meaningOfThis = new MeaningOfThis();
		meaningOfThis.doIt();

		// Generic
		GenericUse.use();
	}


}

