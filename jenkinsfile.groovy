node ('linux'){
	echo 'Starting linux node'
	stage 'Build and Test'
	env.PATH = "${tool 'Maven 3'}/bin:${env.PATH}"
	checkout scm
	sh 'mvn clean package'
}
