package Tiger043

import Tiger043.buildTypes.*
import Tiger043.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger043")
    name = "Tiger043"

    vcsRoot(Tiger043_cVCSroot)

    buildType(Tiger043_Hi3)
    buildType(Tiger043_Hi2)
    buildType(Tiger043_Hi1)
    buildType(Tiger043_Hi0)
})
