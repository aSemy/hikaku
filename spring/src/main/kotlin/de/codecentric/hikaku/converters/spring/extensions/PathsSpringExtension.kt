package de.codecentric.hikaku.converters.spring.extensions

import org.springframework.web.servlet.mvc.method.RequestMappingInfo

internal fun RequestMappingInfo.paths(): Set<String> = buildSet {
  patternsCondition?.patterns?.let(::addAll)
//  patternsCondition?.directPaths?.let(::addAll)
  pathPatternsCondition?.patterns?.map { it.patternString }?.let(::addAll)
//  pathPatternsCondition?.directPaths?.let(::addAll)
//  addAll(directPaths)
}
