package it.italiaonline.rnd

import spock.lang.Specification

/**
 * This Spock specification was auto generated by 'gigawatt'
 * @author gsus
 * @date 10-03-2017 10.46
 */
class GZipEngineSpec extends Specification {
	def "someGZipEngineMethod returns true"() {
		setup:
			GZipEngine lib = new GZipEngine()
		when:
			Boolean result = lib.someGZipEngineMethod()
		then:
			result == true
	}
}
