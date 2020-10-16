/*
 * (C) Copyright 2015 Netcentric AG.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package biz.netcentric.cq.tools.actool.configreader;

import java.util.List;
import java.util.Map;

import javax.jcr.Session;

import biz.netcentric.cq.tools.actool.history.InstallationLogger;

/** Processes FOR and IF statements in yaml files.
 * 
 * @author ghenzler */
public interface YamlMacroProcessor {

    List<Map> processMacros(List<Map> yamlList, Map<String, Object> globalVariables, InstallationLogger history, Session session);

}