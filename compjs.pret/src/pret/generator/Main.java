/*
 * generated by Xtext 2.25.0
 */
package pret.generator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import pret.MyDelegateGenerator;
import pret.MyDslStandaloneSetup;

public class Main {

	/***
	 * @param args0 : input (path to) file
	 * @param args1 : output (path to) file
	 * @param args3 : general indentation, gets overwritten by the other specific
	 *              indentation ( if -1 or not specified => 4)
	 * @param args4 : If indentation
	 * @param args5 : Wh indentation
	 * @param args6 : for indentation
	 * @param args7 : foreach indentation
	 * @param args8 : Else indentation 
	 * For every specific indent parameter, if equals -1 or not specified it takes the value of generalIndent
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Aborting: no path to EMF resource provided!");
			return;
		}
		if (args.length == 1) {
			Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
			Main main = injector.getInstance(Main.class);
			main.runGenerator(args[0], args[0].substring(args[0].lastIndexOf('/')), 2, 2, 2, 2, 2, 2);
		} else if (args.length == 2) {
			Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
			Main main = injector.getInstance(Main.class);
			main.runGenerator(args[0], args[1], 2, 2, 2, 2, 2, 2);
		} else {
			Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
			Main main = injector.getInstance(Main.class);

			int defaultInd = Integer.parseInt(args[2]);
			List<Integer> listInd = new LinkedList<Integer>();
			for (int i = 3; i < 8; i++) {
				if (args[i] == null || Integer.parseInt(args[i]) == -1)
					listInd.add(defaultInd);
				else
					listInd.add(Integer.parseInt(args[i]));
			}
			main.runGenerator(args[0], args[1], defaultInd, listInd.get(0), listInd.get(1), listInd.get(2), listInd.get(3),
					listInd.get(4));
		}
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private MyDelegateGenerator generator;

	@Inject
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String string,String out, int mainInd, int ifInd, int whInd, int forInd, int foreInd, int elInd) {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(string), true);

		// Validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// Configure and start the generator
		fileAccess.setOutputPath("generatedFiles/");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		generator.generate(resource, fileAccess, context, mainInd, ifInd, whInd, forInd, foreInd, elInd, out);

		System.out.println("Code generation finished.");
	}
}
