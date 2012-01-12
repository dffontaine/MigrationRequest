package edu.conncoll

class SampleDomain {

	String name
	
	long value
	
    static constraints = {
		name	blank: false
		value	nullable: false, range: 1..50
    }
}
