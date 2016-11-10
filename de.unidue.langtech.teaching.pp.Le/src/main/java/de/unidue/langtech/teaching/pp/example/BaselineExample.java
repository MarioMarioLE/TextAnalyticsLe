package de.unidue.langtech.teaching.pp.example;

import java.util.Collection;
import java.util.List;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.unidue.langtech.teaching.pp.type.DetectedLanguage;

/**
 * The baseline always identifies "EN" as the document language.
 * 
 * @author zesch
 *
 */
public class BaselineExample
    extends JCasAnnotator_ImplBase
{

    @Override
    public void process(JCas jcas)
        throws AnalysisEngineProcessException
    {
        System.out.println("Document is: " + jcas.getDocumentText());
        
        Collection<Token> tokens = JCasUtil.select(jcas, Token.class); 
        System.out.println("CAS contains " + tokens.size() + " tokens.");
        
        DetectedLanguage languageAnno = new DetectedLanguage(jcas);
        
 //       String[] KeywordEN={"I","the","she"};
        
//        for(Token t:tokens){
//        	System.out.println(t.getCoveredText());
//        	if(t.getCoveredText().equals("the"));
//        	languageAnno.setLanguage("EN");
//        	  languageAnno.addToIndexes();
//        }
        
        for(Token t:tokens){
        	System.out.println(t.getCoveredText());
        	if(t.getCoveredText().equals("te"));
        	languageAnno.setLanguage("FR");
        	  languageAnno.addToIndexes();
        }
        
//        for(Token t:tokens){
//        	System.out.println(t.getCoveredText());
//        	if(t.getCoveredText().equals("ist"));
//        	languageAnno.setLanguage("DE");
//        	  languageAnno.addToIndexes();
//        }
        
 
        
        
        
        	//DetectedLanguage languageAnno = new DetectedLanguage(jcas);
  
        
        
        //languageAnno.setLanguage("EN");
        //languageAnno.addToIndexes();
    }
}