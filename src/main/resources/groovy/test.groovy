println "success"
println "cmd /C ant -version".execute().text

3.times{println "$it"}

def foo(str){
	str?.reverse()
}
println foo("abc")