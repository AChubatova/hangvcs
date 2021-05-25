package Tiger002

import Tiger002.buildTypes.*
import Tiger002.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger002")
    name = "Tiger002"

    vcsRoot(Tiger002_cVCSroot)

    buildType(Tiger002_Hi0)
    buildType(Tiger002_Hi3)
    buildType(Tiger002_Hi1)
    buildType(Tiger002_Hi2)
})
