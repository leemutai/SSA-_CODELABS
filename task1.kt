import java.lang.reflect.Array.get

enum class Daypart {
	MORNING,
	AFTERNOON,
	EVENING,
	
}
data class Event(
	val title: String,
	val description: String? = null,
	val daypart: Daypart,
	val durationInMinutes: Int
)
fun main() {
	val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
	val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
	val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
	val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
	val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
	val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
	
	
	
	val events = mutableListOf<Event>(event1,event2,event3,event4,event5,event6)
	val shortEvents = events.filter { it.durationInMinutes < 60 }
	val groupedEvents = events.groupBy { it.daypart }
	
	groupedEvents.forEach{(daypart, events) ->
		println("$daypart: ${events.size} events")
		println("last event of the day:${events.last().title}")
	}
	
//	val Event.durationOfEvent: String
//	    get()= if (this.durationInMinutes < 60) {
//			"short"
//		} else {
//			"long"
//		}

//	val summary = events.groupBy { it.daypart }
//		.mapValues { (_,events) -> events.size }
//	for ((daypart, count) in summary) {
//		println("$daypart: $count events") //another method we could use
//	}
	println("You have ${shortEvents.size} short events")
//	val shortEventsCount = events.count { it.durationInMinutes < 60 }
//	println("You have $shortEventsCount short events")
//	val event = Event(
//		title = "Study Kotlin",
//		description = "Commit to study kotlin at least 15 minutes per day",
//		daypart = Daypart.MORNING,
//		durationInMinutes = 15
//	)
//	println("Event Title: ${event.title}")
//	println("Event Description: ${event.description}")
//	println("Event Daypart: ${event.daypart}")
//	println("Event Duration: ${event.durationInMinutes}")
}