[An Overview of Designing Microservices -March 2017 AWS|https://www.youtube.com/watch?v=Ijs55IA8DIk]
by Peter Dalbhanjan

Related to monitoring (31' 44''):

h2. Principle 4: Be a good citizen within the ecosystem

h3. Good communication between Microservice provider and client:
- service owners are responsible to publish health metrics - to make clients aware
- clients should do exponential backoff

h3. Have clear SLA - TPS a MS can handle

h3. Distributed monitoring, logging and tracing (33' 05'')
* "Is the service meeting its SLA?"
* "Which services were involved in a request?"
* "How did downstream dependencies perform?"

h3. Shared metrics
* e.g. service dependency, request/response time

h3. Distributed tracing
* AWS X-Ray
* 3rd party: Zipkin, OpenTracing

h3. User-experience metrics
* Status-codes, latency, error counts, time to first byte 

h3. Important advices
* Very important to spend time on code that analyses the *meaning of metrics* than code that moves, stores or displays metrics.
* Reduce the key business metric latency to less than the human attention span (< 10 seconds)
* Monitor systems need to be more available and scaleable than services being monitored.  

h2. Services

h3. AWS X-Ray (34' 44'')
_"Distributed tracing service that enables developers to analyze the behaviour of their applications"_

Features:
* End-to-end view of request as you travel through the application
* Shows map of application underlying components
* Service map shows you relationship between all the resources in real time 
* You can quickly see where high latencies are occurring and drill down to services that are performing poorly

How is it doing that:
* Captures trace data from code running on EC2 instances, ETS containers, Elastic Beanstalk, API Gatewa, Lambda ...
* Adds HTTP header to requests 
* Data collected at each point is called segment and is stored as a chunk of JSON data. A segment represents a unit of work and includes request and response timing. There are sub-segments - smaller work units. You can down deep as a line of code (if you supply proper instrumentation).
* X-Ray is a deamon service on EC2 instance and also inside a container.
* Segments are assembled into *traces* - a group of segments that share common ID.
* Segments and traces are further processed to create service graphs that visually depict the relationship to each other.
 
There is only a checkbox to enable X-Ray on an instance. 
h3. Demo (37' 48'' - 44' 06'')
