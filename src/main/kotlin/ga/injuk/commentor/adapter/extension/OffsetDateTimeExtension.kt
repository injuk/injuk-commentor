package ga.injuk.commentor.adapter.extension

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

internal fun LocalDateTime.toOffsetDateTime(): OffsetDateTime
    = OffsetDateTime.of(this, ZoneOffset.UTC)