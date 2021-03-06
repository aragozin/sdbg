/*
 * Copyright (c) 2012, the Dart project authors.
 * 
 * Licensed under the Eclipse Public License v1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.github.sdbg.debug.core.internal.util;


/**
 * A compilation server for Dart code.
 */
public class CompilationServer {
//&&& Class seems not to be used at all?  
//  private static CompilationServer server = new CompilationServer();
//
//  public static CompilationServer getServer() {
//    return server;
//  }
//
//  private CompilationServer() {
//
//  }
//
//  public void recompileJavaScriptArtifact(File jsFile) {
//    String dartName = jsFile.getName();
//    dartName = dartName.substring(0, dartName.length() - ".js".length());
//
//    // Is there a .dart file?
//    IPath jsPath = Path.fromOSString(jsFile.getPath());
//    IPath dartPath = jsPath.removeLastSegments(1).append(dartName);
//    File dartFile = dartPath.toFile();
//
//    if (dartFile.exists()) {
//      // Is it a library?
//      IFile[] resources = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(
//          dartFile.toURI());
//
//      if (resources.length > 0) {
//        IFile dartResource = resources[0];
//
//        LibraryElement library = DartCore.getProjectManager().getLibraryElement(dartResource);
//
//        if (library != null && !library.isUpToDate(jsFile.lastModified())) {
//          // Recompile it.
//          compile(dartResource, jsFile);
//        }
//      }
//    }
//  }
//
//  private void compile(IFile dartFile, File outFile) {
//    MessageConsole console = DartCore.getConsole();
//    try {
//      IPath inputPath = dartFile.getLocation();
//      IPath outputPath = Path.fromOSString(outFile.getPath());
//
//      Dart2JSCompiler compiler = new Dart2JSCompiler();
//      compiler.setSuppressWarnings(true);
//
//      console.printSeparator("Compiling " + dartFile.getFullPath() + "...");
//
//      CompilationResult result = compiler.compile(
//          inputPath,
//          outputPath,
//          new NullProgressMonitor(),
//          console);
//
//      String output = result.getAllOutput();
//
//      if (output.length() > 0) {
//        console.println(output);
//      }
//    } catch (IOException ex) {
//      console.println("Error while compiling: " + ex.toString());
//
//      DartDebugCorePlugin.logError(ex);
//    }
//  }
//
}
