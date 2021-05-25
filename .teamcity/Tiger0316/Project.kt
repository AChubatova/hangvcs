package Tiger0316

import Tiger0316.buildTypes.*
import Tiger0316.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0316")
    name = "Tiger0316"

    vcsRoot(Tiger0316_cVCSroot)

    buildType(Tiger0316_Hi3)
    buildType(Tiger0316_Hi1)
    buildType(Tiger0316_Hi2)
    buildType(Tiger0316_Hi0)
})
