/*
 * generated by Xtext 2.25.0
 */
package pret.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import pret.myDsl.Commands
import pret.myDsl.Equal
import pret.myDsl.For
import pret.myDsl.Foreach
import pret.myDsl.If
import pret.myDsl.Input
import pret.myDsl.Model
import pret.myDsl.Output
import pret.myDsl.While
import pret.myDsl.Expression
import pret.myDsl.ExprBase
import pret.myDsl.EBtl
import pret.myDsl.EBsy
import pret.myDsl.EBlist
import pret.myDsl.EBcons
import pret.myDsl.EBhd
import pret.myDsl.LExpr
import org.eclipse.emf.common.util.EList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	// string to generate depending on the indentation
	public static String ifI = "";
	public static String whI = "";
	public static String forI = "";
	public static String foreI = "";
	public static String mainI = "";
	public static String elI = "";

	public static String ourInd = "";

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		GenenrateAllIndent(4, 4, 4, 4, 4, 4);
		fsa.generateFile('generated.txt', compile(resource.allContents.toIterable.filter(typeof(Model)).get(0)))
	}

	def doGeneratIndent(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, int mainInd, int ifInd,
		int whInd, int forInd, int foreInd, int elInd, String outFile) {
		GenenrateAllIndent(mainInd, ifInd, whInd, forInd, foreInd, elInd);
		fsa.generateFile(outFile, compile(resource.allContents.toIterable.filter(typeof(Model)).get(0)))
	}

	def GenenrateAllIndent(int mainInd, int ifInd, int whInd, int forInd, int foreInd, int elInd) {
		ourInd = "";
		mainI = "";
		whI = "";
		forI = "";
		foreI = "";
		ifI = "";
		elI = ""; // reset
		for (var int i = 0; i < mainInd; i++) {
			mainI += " "
		}
		for (var int i = 0; i < ifInd; i++) {
			ifI += " "
		}
		for (var int i = 0; i < whInd; i++) {
			whI += " "
		}
		for (var int i = 0; i < forInd; i++) {
			forI += " "
		}
		for (var int i = 0; i < foreInd; i++) {
			foreI += " "
		}
		for (var int i = 0; i < elInd; i++) {
			elI += " "
		}
	}

	private def increaseInd(int fctInt) {
		switch (fctInt) {
			case -1:
				ourInd += mainI
			case 0:
				ourInd += ifI
			case 1:
				ourInd += whI
			case 2:
				ourInd += forI
			case 3:
				ourInd += foreI
			case 4:
				ourInd += elI
		}
	}

	private def decreaseInd(int fctInt) {
		switch (fctInt) {
			case -1:
				ourInd = ourInd.substring(0, ourInd.length - mainI.length)
			case 0:
				ourInd = ourInd.substring(0, ourInd.length - ifI.length)
			case 1:
				ourInd = ourInd.substring(0, ourInd.length - whI.length)
			case 2:
				ourInd = ourInd.substring(0, ourInd.length - forI.length)
			case 3:
				ourInd = ourInd.substring(0, ourInd.length - foreI.length)
			case 4:
				ourInd = ourInd.substring(0, ourInd.length - elI.length)
		}
	}

	/*
	 * useless now
	 */
	private def compile2(Model m) {
		'''
			�FOR prog : m.programme�
				�FOR fun : prog.func�
					function �fun.fname�:
					�var def = fun.fdef�
					read �def.defInput.generateInput�
					%
					� def.defCommands.generateCommand()�
					%
					write �def.defOutput.generateOutput�
				�ENDFOR�
			�ENDFOR�
			
		'''
	}

	private def compile(Model m) {
		increaseInd(-1)
		var String rt = "";
		for (prog : m.programme) {
			for (fun : prog.func) {
				rt += "function " + fun.fname + ": \n"
				var def = fun.fdef;
				rt += "read " + def.defInput.generateInput() + "\n%\n"
				rt += def.defCommands.generateCommand() + "%\n"
				rt += "write " + def.defOutput.generateOutput()+"\n\n"
			}
		}
		rt = rt.substring(0, rt.length - 2)
		return rt
	}

	private def generateInput(Input In) {
		'''�FOR i : In.vai SEPARATOR ", "��i��ENDFOR�'''
	}

	private def generateOutput(Output Ou) {
		'''�FOR o : Ou.vao SEPARATOR ", "��o��ENDFOR�'''
	}

	/* Useless now */
	private def generateCommand2(Commands comms) {
		'''
			�FOR comm : comms.LCommand SEPARATOR " ;"��IF comm.eq !== null�
				�comm.eq.generateEq()�
			�ENDIF�
			�IF comm.^if !== null�
				�comm.^if.generateIf()�
			�ENDIF�
			�IF comm.wh !== null�
				�comm.wh.generateWh()�
			�ENDIF�
			�IF comm.fo !== null�
				�comm.fo.generateFor()�
			�ENDIF�
			�IF comm.fore !== null�
				�comm.fore.generateForeach()�
			�ENDIF�
			�IF comm.no !== null�
				nop
			�ENDIF��ENDFOR�
		'''
	}

	private def generateCommand(Commands comms) {
		var String rt = "";
		for (comm : comms.LCommand) {
			if (comm.eq !== null) {
				rt += ourInd + comm.eq.generateEq();
			}
			if (comm.^if !== null) {
				rt += comm.^if.generateIf();
			}
			if (comm.wh !== null) {
				rt += comm.wh.generateWh();
			}
			if (comm.fo !== null) {
				rt += comm.fo.generateFor();
			}
			if (comm.fore !== null) {
				rt += comm.fore.generateForeach();
			}
			if (comm.no !== null) {
				rt += ourInd + "nop"
			}
			rt += " ;\n"
		}
		rt = rt.substring(0, rt.length - 3) + "\n"
		return rt;
	}

	private def generateEq(Equal eq) {
		'''
		�FOR v : eq.vars.lvars SEPARATOR ", "��v��ENDFOR� := �FOR e : eq.exp.lexpr SEPARATOR ","��e.generateExpression()��ENDFOR�'''
	}

	/* useless now */
	private def generateIf2(If ifst) {
		'''
		if �ifst.exp.generateExpression()� then
		�ifst.iflc.generateCommand()�
		�IF ifst.ellc!== null�
			else
			�ifst.ellc.generateCommand()��ENDIF�fi'''
	}

	private def generateIf(If ifst) {
		var String rt = "";
		rt += ourInd + "if " + ifst.exp.generateExpression() + " then\n";
		increaseInd(0)
		rt += ifst.iflc.generateCommand()
		decreaseInd(0)
		if (ifst.ellc !== null) {
			rt += ourInd + "else\n";
			increaseInd(4)
			rt += ifst.ellc.generateCommand()
			decreaseInd(4);
		}
		rt += ourInd + "fi"
		return rt
	}

	/*useless now */
	private def generateWh2(While whst) {
		'''
		while �whst.exp.generateExpression()� do
		�whst.whcom.generateCommand()�od'''
	}

	private def generateWh(While whst) {
		var String rt = "";
		rt += ourInd + "while " + whst.exp.generateExpression() + " do\n"
		increaseInd(1)
		rt += whst.whcom.generateCommand();
		decreaseInd(1)
		rt += ourInd + "od"
		return rt
	}

	/*useless now */
	private def generateFor2(For fost) {
		'''
		for �fost.exp.generateExpression()� do
		�fost.focom.generateCommand()�od'''
	}

	private def generateFor(For fost) {
		var String rt = ""
		rt += ourInd + "for " + fost.exp.generateExpression() + " do\n"
		increaseInd(2)
		rt += fost.focom.generateCommand()
		decreaseInd(2);
		rt += ourInd + "od"
		return rt;
	}

	/*useless now */
	private def generateForeach2(Foreach forest) {
		'''
		foreach �forest.forevar� in �forest.exp.generateExpression()� do
		�forest.forecom.generateCommand()�od'''
	}

	private def generateForeach(Foreach forest) {
		var String rt = "";
		rt += ourInd + "foreach " + forest.forevar + " in " + forest.exp.generateExpression() + " do\n"
		increaseInd(3)
		rt += forest.forecom.generateCommand()
		decreaseInd(3);
		rt += ourInd + "od"
		return rt
	}

	private def generateExpression(Expression e) {
		var String ex = "";
		ex += e.expbg.generateExprBase();
		if (e.expbd !== null) {
			ex += " =? " + e.expbd.generateExprBase();
		}
		return ex;
	}

	private def generateExprBase(ExprBase eb) {
		var String exb = "";
		if (eb.v !== null) {
			exb = eb.v;
		}
		if (eb.ni !== null) {
			exb += "nil";
		}
		if (eb.sy !== null) {
			exb += eb.sy;
		}
		if (eb.ebt !== null) {
			exb += eb.ebt.generateEBtl();
		}
		if (eb.ebl !== null) {
			exb += eb.ebl.generateEBlist();
		}
		if (eb.ebc !== null) {
			exb += eb.ebc.generateEBcons();
		}
		if (eb.ebh !== null) {
			exb += eb.ebh.generateEBhd();
		}
		if (eb.ebs !== null) {
			exb += eb.ebs.generateEBsy();
		}
		return exb;
	}

	private def generateEBtl(EBtl s) {
		var String tl = "";
		tl += "(tl " + s.expb.generateExprBase() + ")";
		return tl;
	}

	private def generateEBlist(EBlist s) {
		var String lis = "";
		lis += "(list " + s.le.generateLexpr() + ")";
		return lis;
	}

	private def generateEBcons(EBcons s) {
		var String co = "";
		if (s.lexpb.size==0) {
			co += "(cons)"
		} else {
			co += "(cons " + s.lexpb.generateLexpb() + ")";
		}
		return co;
	}

	def String generateLexpb(EList<ExprBase> list) {
		'''�FOR i : list SEPARATOR " "��i.generateExprBase()��ENDFOR�'''
	}

	private def generateEBhd(EBhd s) {
		var String hd = "";
		hd += "(hd " + s.expb.generateExprBase() + ")";
		return hd;
	}

	private def generateEBsy(EBsy s) {
		var String lis = "";
		lis += "(" + s.sy + " " + s.le.generateLexpr() + ")";
		return lis;
	}

	private def generateLexpr(LExpr le) {
		'''�FOR i : le.lexpb SEPARATOR " "��i.generateExprBase()��ENDFOR�'''
	}

}