package de.lisaplus.atlas.interf

import de.lisaplus.atlas.model.Model

/**
 * Created by eiko on 02.06.17.
 */
interface ICodeGen {
    /**
     * This funkction is called to start the code generation process
     * @param model model that is the base for the code generation
     * @param outputBasePath under this path the output is generated. A generator can add a needed sub path if needed (for instance for packeges)
     * @param extraParams additional parameters to initialize the generator
     */
    void doCodeGen(Model model, String outputBasePath, Map<String,String> extraParams)
}