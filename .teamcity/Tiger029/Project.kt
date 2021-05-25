package Tiger029

import Tiger029.buildTypes.*
import Tiger029.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger029")
    name = "Tiger029"

    vcsRoot(Tiger029_cVCSroot)

    buildType(Tiger029_Hi2)
    buildType(Tiger029_Hi3)
    buildType(Tiger029_Hi0)
    buildType(Tiger029_Hi1)
})
