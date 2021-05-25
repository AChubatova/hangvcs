package Tiger000

import Tiger000.buildTypes.*
import Tiger000.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger000")
    name = "Tiger000"

    vcsRoot(Tiger000_cVCSroot)

    buildType(Tiger000_Hi3)
    buildType(Tiger000_Hi1)
    buildType(Tiger000_Hi2)
    buildType(Tiger000_Hi0)
})
